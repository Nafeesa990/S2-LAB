declare
s varchar2(10);
i varchar2(10);
rev varchar2(10);
begin
s:='&s';
for i in reverse 1..length(s)
loop  rev:=rev||substr(s,i,1);
end loop;
dbms_output.put_line('reverse of '||s|| ' is ' ||rev);
end;
/
set serveroutput on