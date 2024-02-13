#!usr/bin/perl
use employee;
$object = new employee("Jack","Pattinson",2323332);
$firstName = $object->getFirstName();
print "First Name : $firstName\n";
$object->setFirstName( "Robert" );
$firstName = $object->getFirstName();
print "First Name after update : $firstName\n";
