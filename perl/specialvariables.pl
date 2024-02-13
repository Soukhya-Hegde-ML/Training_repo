#!/usr/bin/perl

foreach ('hi','hello','bye') {
   print $_;
   print "\n";
}
local $_ ='abcdefghi';
/def/;
print "$`:$&\n"; #prematch
print "$&:$'\n"; #postmatch

