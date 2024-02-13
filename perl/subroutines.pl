$string="Outside";
sub Average {
   
   $n = scalar(@_);
   $sum = 0;
   my $string;
   $string="Inside subroutine";
   print $string,"\n";
   foreach $item (@_) {
      $sum += $item;
   }
   $average = $sum / $n;

   return $average;
}

$avg= Average(10, 20, 30);
print "Average : $avg\n";
print $string,"\n";
