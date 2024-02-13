#!/usr/bin/perl
package employee;
use Person;
use strict;
our @ISA =qw(Person);

sub getFirstName {
   my( $self ) = @_;
   print "This is child class helper function\n";
   return $self->{_firstName};
}
1;
