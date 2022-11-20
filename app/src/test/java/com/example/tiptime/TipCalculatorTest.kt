package com.example.tiptime

import junit.framework.Assert
import org.junit.Test

class TipCalculatorTest {
    @Test
    fun calculate20PercentTipNoRoundUp(){
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = "$2.00"
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        Assert.assertEquals(expectedTip, actualTip)
    }
}