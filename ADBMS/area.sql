declare
r number(5);
a number(6,2);
pi constant number(3,2):=3.14;
begin
r:=&r;

a:=pi*r*r;

dbms_output.put_line('Area='||a);
end;
/
set serveroutput on