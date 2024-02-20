# Даны целые положительные числа A и B. Найти их наибольший общий делитель (НОД),
# используя алгоритм Евклида: НОД(A, B) = НОД(B, A mod B), если B ≠ 0;
# НОД(A, 0) = A, где «mod» обозначает операцию взятия остатка от деления.

defmodule While23 do
  #
  def gcd(a, b) when a <= 0, do: raise(ArgumentError, "error")

  def gcd(a, b) when a > 0 and b > 0 do
    _gcd(a, b)
  end

  defp _gcd(a, b) when b == 0 do
    a
  end

  defp _gcd(a, b) do
    gcd(b, rem(a, b))
  end
end

a =
  IO.gets("Input A: ")
  |> String.trim()
  |> String.to_integer()

b =
  IO.gets("Input B: ")
  |> String.trim()
  |> String.to_integer()

While23.gcd(a, b)
|> IO.inspect()
