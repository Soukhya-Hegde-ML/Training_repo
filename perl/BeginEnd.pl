#!/usr/bin/perl
package BeginEnd;
print "Begin and End Block Demo\n";

BEGIN { 
   print "This is BEGIN Block\n" 
}

END { 
   print "This is END Block\n" 
}

1;
