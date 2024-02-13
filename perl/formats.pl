#!/usr/bin/perl

format EMPLOYEE = 
==============================
@<<<<<<<<<<<<<<< @<<
$name, $age
@#####.##
$salary
==============================
.


format EMPLOYEE_TOP =
===================================
Name             Age
===================================
.
select(STDOUT);
$~ = EMPLOYEE;
$^ = EMPLOYEE_TOP;
@names = ("abc", "pqr", "xyz");
@ages  = (20,30, 40);
@sal = (25000.00, 30000.00, 40000.00);

$person = 0;
foreach (@names) {
   $name = $_;
   $age = $ages[$person];
   $salary = $sal[$person++];
   write;
}
