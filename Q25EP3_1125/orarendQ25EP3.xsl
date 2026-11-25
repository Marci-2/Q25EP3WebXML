<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head>
                <meta charset="UTF-8"/>
                <title>Q25EP3 Órarend – 2026. I. félév</title>
                <style>
                    body {
                    font-family: Arial, sans-serif;
                    margin: 24px;
                    background-color: #ffffff;
                    }
                    .container {
                    max-width: 1000px;
                    margin: 0 auto;
                    background-color: #f4f6f8;
                    padding: 16px;
                    }
                    h1 {
                    text-align: center;
                    color: #1f4e78;
                    margin-top: 0;
                    font-size: 22px;
                    }
                    table {
                    width: 100%;
                    border-collapse: collapse;
                    background-color: #ffffff;
                    }
                    th {
                    background-color: #1f4e78;
                    color: #ffffff;
                    padding: 8px 10px;
                    border: 1px solid #d0d7de;
                    font-size: 13px;
                    }
                    td {
                    padding: 8px 10px;
                    border: 1px solid #d0d7de;
                    text-align: center;
                    font-size: 13px;
                    }
                    tr:nth-child(even) td {
                    background-color: #dce6f1;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>Q25EP3 Órarend – 2026. I. félév</h1>
                    <table>
                        <tr>
                            <th>ID</th>
                            <th>Tantárgy</th>
                            <th>Típus</th>
                            <th>Nap</th>
                            <th>Kezdés</th>
                            <th>Befejezés</th>
                            <th>Helyszín</th>
                            <th>Oktató</th>
                            <th>Szak</th>
                        </tr>
                        <xsl:for-each select="LM_orarend/ora">
                            <tr>
                                <td><xsl:value-of select="@id"/></td>
                                <td><xsl:value-of select="targy"/></td>
                                <td><xsl:value-of select="@típus"/></td>
                                <td><xsl:value-of select="idopont/nap"/></td>
                                <td><xsl:value-of select="idopont/tol"/></td>
                                <td><xsl:value-of select="idopont/ig"/></td>
                                <td><xsl:value-of select="helyszin"/></td>
                                <td><xsl:value-of select="oktato"/></td>
                                <td><xsl:value-of select="szak"/></td>
                            </tr>
                        </xsl:for-each>
                    </table>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>