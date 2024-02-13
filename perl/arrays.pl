#!usr/bin/perl
@array1=(1,2,3);
print "Array : ",@array1,"\n";
print "Size of array: ",scalar@array1,"\n";
push(@array1, 4);
print "modified array after push: ",@array1,"\n";
unshift(@array1,5);
print "modified array after unshift: ",@array1,"\n";
pop(@array1);
print "modified array after pop: ",@array1,"\n";
shift(@array1);
print "modified array after shift: ",@array1,"\n";

foreach $word (@array1)
{
	print $word,"\n";
}

@array2 = (10,11,12);
@merged=(@array1,@array2);
print "@merged\n";
