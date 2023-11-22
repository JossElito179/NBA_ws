CREATE view v_rebond_moyenne as
SELECT 
SUM(rebond.nombre)/COUNT(stat.id_match) as rpm,
Stat.id_joueur
from 
rebond
JOIN stat on stat.id=rebond.id_stat
GROUP BY
stat.id_joueur;

CREATE view v_passe_moyenne as
SELECT 
SUM(passe_d.nombre)/COUNT(stat.id_match) as pdpm,
stat.id_joueur
from 
passe_d
JOIN stat on stat.id=passe_d.id_stat
GROUP BY
stat.id_joueur;

Create view v_tir_points as
select 
tir.*,
type_tir.points
from tir
join type_tir on type_tir.id=tir.id_type_tir;

Create view v_point_moyenne as
select 
SUM(v_tir_points.points)/COUNT(stat.id_match) as ppm,
stat.id_joueur
from v_tir_points
join stat on v_tir_points.id_stat=stat.id 
where etat=1
GROUP BY
stat.id_joueur;

create view v_all2points as
select
COUNT(v_tir_points.id) as isa,
Stat.id_joueur
FROM
v_tir_points
JOIN stat on stat.id=v_tir_points.id_stat
WHERE
v_tir_points.id_type_tir=1
GROUP BY
stat.id_joueur;

create view v_all3points as
select
COUNT(v_tir_points.id) as isa,
Stat.id_joueur
FROM
v_tir_points
JOIN stat on stat.id=v_tir_points.id_stat
WHERE
v_tir_points.id_type_tir=2
GROUP BY
stat.id_joueur;

create view v_all1points as
select
COUNT(v_tir_points.id) as isa,
Stat.id_joueur
FROM
v_tir_points
JOIN stat on stat.id=v_tir_points.id_stat
WHERE
v_tir_points.id_type_tir=3
GROUP BY
stat.id_joueur;

create view v_allpoints as
select
COUNT(v_tir_points.id) as isa,
Stat.id_joueur
FROM
v_tir_points
JOIN stat on stat.id=v_tir_points.id_stat
GROUP BY
stat.id_joueur;

create view v_fg as
select 
COUNT(v_tir_points.id)*100/v_allpoints.isa as fg,
stat.id_joueur
from v_tir_points
join stat on v_tir_points.id_stat=stat.id 
join v_allpoints on v_allpoints.id_joueur=stat.id_joueur
where 
etat=1
GROUP BY
stat.id_joueur,
v_allpoints.isa;

create view v_3pp as
select 
COUNT(v_tir_points.id)*100/v_all3points.isa as fg,
stat.id_joueur
from v_tir_points
join stat on v_tir_points.id_stat=stat.id 
join v_all3points on v_all3points.id_joueur=stat.id_joueur
where 
etat=1
GROUP BY
stat.id_joueur,
v_all3points.isa;

create view v_lf as
select 
COUNT(v_tir_points.id)*100/v_all1points.isa as fg,
stat.id_joueur
from v_tir_points
join stat on v_tir_points.id_stat=stat.id 
join v_all1points on v_all1points.id_joueur=stat.id_joueur
where 
etat=1
GROUP BY
stat.id_joueur,
v_all1points.isa;

create view v_minute_moyenne as
select 
SUM(mpm.sortie-mpm.entree)/COUNT(stat.id_match) as mpm,
stat.id_joueur
from 
mpm
join stat on stat.id=mpm.id_stat
GROUP BY
stat.id_joueur;

CREATE view v_stat_all as 
select 
joueur.id,
joueur.nom,
joueur.id_equipe,
equipe.nom as nom_equipe,
COUNT(stat.id_match) as mj,
v_point_moyenne.ppm,
v_rebond_moyenne.rpm,
v_passe_moyenne.pdpm,
v_minute_moyenne.mpm,
v_fg.fg
FROM
joueur
join equipe on equipe.id=joueur.id_equipe
join stat on stat.id_joueur=joueur.id
join v_point_moyenne on v_point_moyenne.id_joueur=stat.id_joueur
join v_rebond_moyenne on v_rebond_moyenne.id_joueur=stat.id_joueur
join v_passe_moyenne on v_passe_moyenne.id_joueur=stat.id_joueur
join v_minute_moyenne on v_minute_moyenne.id_joueur=stat.id_joueur
join v_fg on v_fg.id_joueur=stat.id_joueur
GROUP BY 
equipe.nom,
joueur.id,
stat.id_joueur,
v_point_moyenne.ppm,
v_rebond_moyenne.rpm,
v_passe_moyenne.pdpm,
v_minute_moyenne.mpm,
v_fg.fg;

