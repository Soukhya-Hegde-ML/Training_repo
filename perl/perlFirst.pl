#!usr/bin/perl
print "Hello world\n";
$smile = v9786;
#vstrings
print "smile = $smile\n";

#here document
$value = 10;
$var = <<"EOF";
An example for here document 
value of a = $value
EOF
print "Here document: $var\n";

#escape character
$result = "This is \"number\"";
print "$result\n";
print "\$result\n";
