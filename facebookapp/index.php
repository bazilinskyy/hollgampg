<?php
//
// Name: HollgamTest
// githun

// error_reporting(0); // disable warnings

require_once 'includes/facebook.php';

// Create our Application instance.
$facebook = new Facebook(array(
  'appId' => '160254157375723',
  'secret' => 'e68af27abeb5fb4535581a36ec7d96dd',
  'cookie' => true,
));

echo "Awesome facebook app by Pavlo Bazilinskyy. For testing purposes.";

echo '<br /><img src="http://hollgam.com/img/orchestra1.jpg" />';

$fb_user=$facebook->get_loggedin_user();
$user_details=$facebook->api_client->users_getInfo($fb_user, array('last_name','first_name','pic_square'));
echo "details: ";
print_r($user_details);