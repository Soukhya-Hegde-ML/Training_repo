@nums=(1,2,3,4);
$sum=0;
for($count=0;$count<4;$count+=1)
{	
	$sum=$sum+$nums[$count];
}
print "sum: $sum\n";	

$max=3;
while($max>=0)
{
	print "Hi\n";
	$max--;
}

$max=5;
until($max<1)
{
	print $max,"\n";
	$max--;
}
