#!/usr/bin/perl
use 5.010;
print "give a number between 1 and 7\n";
chomp(my $day = <>);
given ($day) {
	when('1') { print "Sunday"};
	when('2') { print "Monday"};
	when('3') { print "Tuesday"};
	when('4') { print "Wednesday"};
	when('5') { print "Thursday"};
	when('6') { print "Friday"};
	when('7') { print "Saturday"};
	default { print "Invalid input"};
}

