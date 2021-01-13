Public Module LuhnAlgo

    Function luhn(ByVal num As String) As Boolean
        Dim digits (num.Length()) As Integer

        For index = 1 To num.Length()
            digits(index) = Int(num(index))
        Next index

        For index = digits.Length() - 1 To 1 Step 2
            digits(index) = digits(index) * 2
            If digits(index) > 9 Then
                digits(index) = digits(index) Mod 2 + digits(index) / 2
            End If
        Next index

        Dim added As Integer = 0

        ForEach digits As digit
            added += digit
        Loop
        'Next digit

        If added Mod 10 Then
            return False
        End If

        return True
    End Function

End Module
