#!/usr/bin/perl

opendir (DIR, '.') or die "Couldn't open directory, $!";
while ($file = readdir DIR) {
   print "$file\n";
}
closedir DIR;

$dir = "/perl";

mkdir( $dir ) or die "Couldn't create $dir directory, $!";
print "Directory created successfully\n";
