#!/usr/bin/perl
open(DATA,"<test.txt") or die "Couldn't open file test.txt,$!";
while(<DATA>){
   print "$_";

}

unlink ("file1.txt");
