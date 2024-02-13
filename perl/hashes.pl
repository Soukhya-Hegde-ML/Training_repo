#/!usr/bin/perl
%data = ("abc",1,"pqr",2,"xyz",3);
print "abc : ",$data{'abc'},"\n";
@keys = keys %data;
$size = @keys;
print "Hash size is: $size\n";
$data{'Ali'} = 55;
@keys = keys %data;
$size = @keys;
print "Hash size is: $size\n";

delete $data{'Ali'};
@keys = keys %data;
$size = @keys;
print "Hash size is: $size\n";


