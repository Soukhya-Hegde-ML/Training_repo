#!/usr/bin/perl
use strict;
use warnings;
use DBI;

my $driver = "mysql";
my $database = "perl";
my $dsn = "dbi:$driver:database=$database";
my $user = "root";
my $password = "root12345";
my $dbh = DBI->connect($dsn,$user,$password,
{
	PrintError => 0,
	RaiseError => 1,
	AutoCommit => 1,
	FetchHashKeyName => 'NAME_1c',
})or die "Failed to connect to database:$DBI::errstr";
#my $sth = $dbh ->prepare("CREATE TABLE EMP_DETAILS (ID INT PRIMARY KEY, EMP_NAME VARCHAR(50),AGE INT, SALARY INT)");
#$sth -> execute();
my $sth1 = $dbh->prepare("INSERT INTO EMP_DETAILS VALUES(?,?,?,?)");
my $id = 1;
my $name = "abc";
my $age = 22;
my $salary = 10000;
# $sth1->execute($id,$name,$age,$salary);
#$sth1->execute($id+2,"pqr",$age,$salary+20000);
#print "Done inserting values.....\n";

my $sth2 = $dbh->prepare("SELECT * FROM EMP_DETAILS");
$sth2->execute();

print "Query results : .....\n";
while (my @row = $sth2 ->fetchrow_array())
{
	print "@row\n";
}
#warn "problem in retrieving results",$sth2->errstr(),"\n";
my $query3 = $dbh->prepare("SELECT emp_name, salary FROM EMP_DETAILS");
$query3->execute();
print "\nQuery 2 results:\n";
while(($name,$salary)=$query3->fetchrow_array())
{
	print "Name : $name, salary : $salary\n";
}

my $update_query = "UPDATE EMP_DETAILS SET emp_name = ? WHERE id = ?";
my $update_sth = $dbh->prepare($update_query);
$update_sth->execute('john', 1);

# Delete operation (DELETE)
my $delete_query = "DELETE FROM EMP_DETAILS WHERE id = ?";
my $delete_sth = $dbh->prepare($delete_query);
$delete_sth->execute(3);
exit;

#$dbh->disconnect;

