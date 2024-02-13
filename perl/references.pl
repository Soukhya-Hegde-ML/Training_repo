#!/usr/bin/perl

$var =5;
$refer = \$var;
print "value of variable is $var\n";
print "value of reference is ",$$refer,"\n";

@array=(1..5);
$ref=\@array;
print "value of reference array : ",@$ref,"\n";


