use feature 'try';
sub printer{
   $var = "Hello world, I am 1st subroutine\n";
   print $var,"\n";
   $value = fileData();
   print $value;
}
sub fileData{
   try {    
           print "Inside try\n";
	   open(DATA,"<test.txt") or die "couldn't open file";
           while(<DATA>){
              print "$_";
       }
       	   open(DATA,"<file3.txt") or die "couldn't open file";
	   while(<DATA>){
	      print "$_";
       }
	print "leaving try..\n";
	
   }
   catch($e){
	warn "catch block,$e";
	return $e;
   }
   $after =  "After try catch";
   return $after;
   
}

printer();
print "Executed everything\n";
