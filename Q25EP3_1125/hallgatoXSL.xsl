<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head>
                <meta charset="UTF-8"/>
                <title>Hallgatok adatai - for-each, value-of</title>
                <style>
                    body { font-family: Arial, sans-serif; margin: 20px; }
                    h2 { text-align: center; }
                    table { border-collapse: collapse; margin: 0 auto; border: 2px solid #333; }
                    th { background-color: #9bbb59; color: #000; border: 1px solid #333; padding: 6px 12px; }
                    td { border: 1px solid #333; padding: 6px 12px; }
                </style>
            </head>
            <body>
                <h2>Hallgatok adatai</h2>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Vezeteknev</th>
                        <th>Keresztnev</th>
                        <th>Becenev</th>
                        <th>Kor</th>
                    </tr>
                    <xsl:for-each select="class/student">
                        <tr>
                            <td><xsl:value-of select="@id"/></td>
                            <td><xsl:value-of select="vezeteknev"/></td>
                            <td><xsl:value-of select="keresztnev"/></td>
                            <td><xsl:value-of select="becenev"/></td>
                            <td><xsl:value-of select="kor"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>