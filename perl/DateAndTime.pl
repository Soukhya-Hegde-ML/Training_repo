#!/usr/local/bin/perl
 
$datestring = localtime();
print "Local date and time $datestring\n";
($sec,$min,$hour,$mday,$mon,$year,$wday,$yday,$isdst) = localtime();

printf("Time Format - HH:MM:SS\n");
printf("%02d:%02d:%02d", $hour, $min, $sec);
