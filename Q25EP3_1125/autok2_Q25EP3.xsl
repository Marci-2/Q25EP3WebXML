<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head><meta charset="UTF-8"/><title>Autók rendszámai</title></head>
            <body>
                <h2>Autók rendszámai</h2>
                <ul>
                    <xsl:for-each select="autok/auto">
                        <xsl:sort select="ar" data-type="number" order="ascending"/>
                        
                        <li><xsl:value-of select="@rsz"/></li>
                        <li><xsl:value-of select="ar"</li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>