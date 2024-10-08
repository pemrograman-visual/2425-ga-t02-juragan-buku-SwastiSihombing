// 12S24037- Maxwell Rumahorbo
// 12S24030- Swasti Silaban

Function Main
    Declare Integer stok, tahunterbit
    Declare String isbn, judul, penulis, penerbit, formatbukuelektrik, none, kategori
    Declare Real hargapembelian, minimummargin, rating

    Input isbn
    Input judul
    Input penulis
    Input tahunterbit
    Input penerbit
    Input formatbukuelektrik
    Input hargapembelian
    Input minimummargin
    Input stok
    Input rating
    If rating >= 4.7
        Assign kategori = "Best Pick"
    Else
        If rating >= 4.5
            Assign kategori = "Must Read"
        Else
            If rating >= 4.0
                Assign kategori = "Recommended"
            Else
                If rating >= 3.0
                    Assign kategori = "Average"
                Else
                    If rating >=0 && rating < 3.0
                        Assign kategori = "Low"
                    Else
                        Assign kategori = "none"
                    End
                End
            End
        End
    End
    Output isbn&"|"&judul&"|"&penulis&"|"&tahunterbit&"|"&penerbit&"|"&formatbukuelektrik&"|"&hargapembelian&"|"&minimummargin&"|"&stok&"|"&rating&"|"&kategori
End


