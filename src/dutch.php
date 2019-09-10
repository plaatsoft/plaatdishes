<?php

/* 
**  ============
**  PlaatDishes
**  ============
**
**  Created by wplaat
**
**  For more information visit the following website.
**  Website : www.plaatsoft.nl 
**
**  Or send an email to the following address.
**  Email   : info@plaatsoft.nl
**
**  All copyrights reserved (c) 1996-2019 PlaatSoft
*/
  
/*
** ------------------
** GENERAL
** ------------------
*/

$lang['TITLE'] = 'PlaatDishes';
$lang['LINK_COPYRIGHT'] = '<a class="normal_link" href="http://www.plaatsoft.nl/">PlaatSoft</a> 1996-'.date("Y").' - All Copyright Reserved ';
$lang['THEME_TO_LIGHT'] = 'Light theme';
$lang['THEME_TO_DARK'] = 'Dark theme';
$lang['ENGLISH'] = 'Engels';
$lang['DUTCH'] = 'Nederlands';

/*
** ------------------
** LINKS
** ------------------
*/

$lang['LINK_HOME']          = i('home'). 'Home'; 
$lang['LINK_SAVE']          = i('edit') . 'Bewaar'; 
$lang['LINK_CANCEL']        = i('times') . 'Cancel';
$lang['LINK_LOGIN']         = 'Login';
$lang['LINK_LOGOUT']        = 'Logout';

/*
** ------------------
** LOGIN
** ------------------
*/

$lang['LABEL_USERNAME'] = 'Gebruikersnaam';
$lang['LABEL_PASSWORD'] = 'Wachtwoord';

$lang ['CONGIG_BAD' ] = 'The following file "config.php" is missing in installation directory.<br/><br/>
PlaatProtect can not  work without!<br/><br/>
Rename config.php.sample to config.inc, update the database settings en press F5 in your browser!';

$lang['DATABASE_CONNECTION_FAILED' ] = 'The connection to the database failed. Please check if config.php settings are right!';

/*
** ------------------
** HOME
** ------------------
*/

$lang['LABEL_ID'] = 'ID';
$lang['LABEL_NAME'] = 'Naam';
$lang['LABEL_SCORE'] = 'Score';
$lang['LABEL_DATE'] = 'Datum';
$lang['LABEL_EXTRA'] = 'Extra';

$lang['LABEL_DISH_HELPER'] = 'Afwas hulp';

$lang['LABEL_DISH_SIZE'] = 'Vaat grootte';

$lang['LABEL_PREPARE_QUALITY'] = 'Afruim kwaliteit';
$lang['LABEL_CLEANING_QUALITY'] = 'Afwas kwaliteit';
$lang['LABEL_CLEANUP_QUALITY'] = 'Opruim kwaliteit';


/*
** ------------------
** THE END
** ------------------
*/

?>