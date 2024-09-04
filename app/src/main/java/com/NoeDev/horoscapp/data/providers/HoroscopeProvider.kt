package com.NoeDev.horoscapp.data.providers

import com.NoeDev.horoscapp.domain.model.HoroscopeInfo
import com.NoeDev.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor(){
    fun getHoroscopes():List<HoroscopeInfo>{
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces

        )
    }
}