declare
a number(4);
begin
a:=&a;
if(a mod 2=0)
then
dbms_output.put_line('the number is even');
else
dbms_output.put_line('the number is odd');
end if;
end;
/
set serveroutput on