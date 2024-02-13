#!/usr/bin/perl
print "Enter your age: \n";
my $age = <STDIN>;
$status = ($age>18)?"Allowed to vote":"not allowed to vote";
print "$status\n";

