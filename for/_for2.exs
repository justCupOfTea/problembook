# Даны два целых числа A и B (A < B).
# Вывести в порядке возрастания все целые числа,
# расположенные между A и B (включая сами числа A и B), а также количество N этих чисел.

a = IO.gets("Input А:")
|>String.trim()
|>String.to_integer()

b = IO.gets("Input B:")
|>String.trim()
|>String.to_integer()

n1 = Kernel.min(a, b)
n2 = Kernel.max(a, b)

Enum.map(n1..n2, fn i-> i end)
|>IO.inspect()
