declare @MinPreco DECIMAL(10,2); -- Declaração de variavel
 
Set @MinPreco = 50; -- definição do valor da variavel
 
select NomeProduto, Preco --consulta usando a variavel
From Produto 
Where Preco >= @MinPreco;

DECLARE @TotalPedidos INT; --declaração de variável

--definição do valor da variável usando SELECT
SELECT @TotalPedidos=COUNT(*)
FROM Pedido;

--exibindo a variável
PRINT 'O total de pedidos é:'+CAST(@TotalPedidos AS NVARCHAR(10));

--------------------------------------------------------------------------------

DECLARE @MediaPreco DECIMAL(10,2); --Declaração da variável

SET @MediaPreco = (
SELECT AVG (Preco)
FROM Produto
WHERE CategoriaID =1);

-- exibindo o valor 
PRINT 'A média de preço na categoria de Eletrônicos é: ' + CAST(@MediaPreco as NVARCHAR(10));

--------------------------------------------------------------------------------

DECLARE @ProdutoMaisCaro NVARCHAR(50); --declaração da variável

--definição do valor da variável usando select
SELECT TOP 1 @ProdutoMaisCaro= NomeProduto
FROM Produto
ORDER BY Preco DESC;

--exibindo valor
PRINT 'O produto mais caro é:' + @ProdutoMaisCaro;

--------------------------------------------------------

SELECT TOP 10 NomeProduto, Preco
FROM Produto
ORDER BY Preco DESC;

-------------------------------------------------------