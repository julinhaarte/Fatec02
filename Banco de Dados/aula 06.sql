select c.Nome_cliente, p.Num_pedido
from cliente c left outer join pedido p on c.cod_cliente = p.cod_cliente
where p.cod_cliente is null

select f.Primeironome, f.salario, s.nomeSetor from Funcionario f right outer join Setor s on f.codSetor = s.codSetor

insert into Setor (nomeSetor)values ('Tribo do ar do Leste')

select c.nome_cliente, p. num_pedido
from cliente c 
full outer join pedido p on c.Cod_cliente = p.cod_cliente

select f.primeiroNome, f.salario, s.nomeSetor
from Funcionario f
full outer join setor s on f.codSetor = s.codSetor

select f.primeiroNome, f.salario, s.nomeSetor
from Funcionario f cross join Setor s order by f.primeiroNome

select c.nome_cliente, p.num_pedido
from cliente c 
cross join pedido p
order by c.Nome_cliente

select min(salario_fixo) as 'MENOR SALÁRIO', max(salario_fixo) as 'MAIOR SALÁRIO'
from vendedor

select sum (quantidade) as 'SOMA'
from item_pedido where cod_produto= 3

select AVG (salario_fixo) as MEDIA_SALARIO
from vendedor

select COUNT (*) from vendedor 
where salario_fixo > 2500.00

select num_pedido, total_produtos = count(*)
from item_pedido
group by num_pedido

select num_pedido, total_produtos = count(*)
from item_pedido
where quantidade >5 
group by num_pedido
having count (*) >1

select * from produto

update produto
set Valor_unitario = 4.00
where descricao = 'Alface'

update produto
set Valor_unitario = Valor_unitario * 1.025
where Valor_unitario <
(select avg(valor_unitario)
from produto 
where Unidade = 'KG')