Module Main

    Sub Main(args As String)
        If args.Length() Then
            System.Console.WriteLine(del.luhn(args(1)))
        Else
            System.Console.WriteLine("No number given")
        End If
    End Sub

End Module
