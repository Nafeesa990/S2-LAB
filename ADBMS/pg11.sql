declare
fact number(10):=1;
n number(5);
begin
n:=&n;
for i in 1..n
loop
fact:=fact*i;
end loop;
dbms_output.put_line('Factorial='||fact);
end;
/
set serveroutput on