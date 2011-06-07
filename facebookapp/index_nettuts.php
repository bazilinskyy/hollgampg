//<?php
//require_once 'includes/facebook.php';
//
//$appapikey = '160254157375723';
//$appsecret = 'e68af27abeb5fb4535581a36ec7d96dd';
//$facebook = new Facebook($appapikey, $appsecret);
//$user_id = $facebook->require_login();
//$callbackurl = 'http://hollgam.com/facebookapp/';
//
////initialize an array of quotes
//$quotes= array("Only those who dare to fail greatly can ever achieve greatly.", "Take my wife. Please!", "I believe what doesn't kill you only makes you... STRANGER");
//
////Select a Random one.
//$i= rand(0, sizeof($quotes)-1);
//
////prepare string for profile box
//$text= ('
//<style type="text/css">
// h1{ margin: 10px; font-size: 24pt; }
// h2{ margin: 15px; font-size: 20pt; }
//</style>
//');
//
//$text.=('<h2>'. $quotes[$i] .'</h2>');
//
//
////set profile text
//$facebook->api_client->profile_setFBML($text, $user_id);
//
////Select a Random one.
//$i= rand(0, sizeof($quotes)-1);
//
////print the CSS
//print ('
//<style type="text/css">
// h1{ margin: 10px; font-size: 24pt; }
// h2{ margin: 15px; font-size: 20pt; }
//</style>
//');
//
//print "<h1>Nettuts Quotes</h1>";
//print "<h2>". $quotes[$i] ."</h2>";
//
//?>

<?php
// Awesome Facebook Application
//
// Name: HollgamTest
//

require_once 'includes/facebook.php';

// Create our Application instance.
$facebook = new Facebook(array(
  'appId' => '160254157375723',
  'secret' => 'e68af27abeb5fb4535581a36ec7d96dd',
  'cookie' => true,
));

echo "Awesome facebook app";