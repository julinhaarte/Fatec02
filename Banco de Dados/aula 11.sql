declare @MinPreco DECIMAL(10,2); -- Declara��o de variavel
 
Set @MinPreco = 50; -- defini��o do valor da variavel
 
select NomeProduto, Preco --consulta usando a variavel
From Produto 
Where Preco >= @MinPreco;

DECLARE @TotalPedidos INT; --declara��o de vari�vel

--defini��o do valor da vari�vel usando SELECT
SELECT @TotalPedidos=COUNT(*)
FROM Pedido;

--exibindo a vari�vel
PRINT 'O total de pedidos �:'+CAST(@TotalPedidos AS NVARCHAR(10));

--------------------------------------------------------------------------------

DECLARE @MediaPreco DECIMAL(10,2); --Declara��o da vari�vel

SET @MediaPreco = (
SELECT AVG (Preco)
FROM Produto
WHERE CategoriaID =1);

-- exibindo o valor 
PRINT 'A m�dia de pre�o na categoria de Eletr�nicos �: ' + CAST(@MediaPreco as NVARCHAR(10));

--------------------------------------------------------------------------------

DECLARE @ProdutoMaisCaro NVARCHAR(50); --declara��o da vari�vel

--defini��o do valor da vari�vel usando select
SELECT TOP 1 @ProdutoMaisCaro= NomeProduto
FROM Produto
ORDER BY Preco DESC;

--exibindo valor
PRINT 'O produto mais caro �:' + @ProdutoMaisCaro;

--------------------------------------------------------

SELECT TOP 10 NomeProduto, Preco
FROM Produto
ORDER BY Preco DESC;

-------------------------------------------------------