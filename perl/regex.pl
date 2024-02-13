#!usr/bin/perl
print "Enter alpha-numeric string\n";
my $alphaNum = <STDIN>;
if ($alphaNum=~m/[0-9a-fA-F]/){
    print "It is valid\n";
}
else{
    print "Not valid\n";
}
