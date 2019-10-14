package com.lamti.daypicker

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.layout_day_picker.view.*

class DayPicker: ConstraintLayout {

    private val daysSelected = ArrayList<String>()
    private val whiteColor = ContextCompat.getColor(context, R.color.colorWhite)
    private val primaryColor = ContextCompat.getColor(context, R.color.colorPrimary)

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {

        inflate(context, R.layout.layout_day_picker,this) as View
        clickListeners()
    }

    private fun clickListeners() {
        sundayB.setOnClickListener { sundayButtonColor() }
        mondayB.setOnClickListener { mondayButtonColor() }
        tuesdayB.setOnClickListener { tuesdayButtonColor() }
        wednesdayB.setOnClickListener { wednesdayButtonColor() }
        thursdayB.setOnClickListener { thursdayButtonColor() }
        fridayB.setOnClickListener { fridayButtonColor() }
        saturdayB.setOnClickListener { saturdayButtonColor() }
    }

    private fun weekButtonsColors() {
        sundayButtonColor(false)
        mondayButtonColor(false)
        tuesdayButtonColor(false)
        wednesdayButtonColor(false)
        thursdayButtonColor(false)
        fridayButtonColor(false)
        saturdayButtonColor(false)
    }

    private fun sundayButtonColor(click: Boolean = true) {
        if ( daysSelected.contains("Sunday") ) {
            if ( click ) {
                daysSelected.remove("Sunday")
                sundayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                sundayB.setTextColor(primaryColor)
            } else {
                sundayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                sundayB.setTextColor(whiteColor)
            }
        } else {
            if ( click ) {
                daysSelected.add("Sunday")
                sundayB.background =
                    ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                sundayB.setTextColor(whiteColor)
            } else {
                sundayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                sundayB.setTextColor(primaryColor)
            }
        }
    }

    private fun mondayButtonColor(click: Boolean = true) {
        if ( daysSelected.contains("Monday") ) {
            if ( click ) {
                daysSelected.remove("Monday")
                mondayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                mondayB.setTextColor(primaryColor)
            } else {
                mondayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                mondayB.setTextColor(whiteColor)
            }
        } else {
            if ( click ) {
                daysSelected.add("Monday")
                mondayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                mondayB.setTextColor(whiteColor)
            } else {
                mondayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                mondayB.setTextColor(primaryColor)
            }
        }
    }

    private fun tuesdayButtonColor(click: Boolean = true) {
        if ( daysSelected.contains("Tuesday") ) {
            if ( click ) {
                daysSelected.remove("Tuesday")
                tuesdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                tuesdayB.setTextColor(primaryColor)
            } else {
                tuesdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                tuesdayB.setTextColor(whiteColor)
            }
        } else {
            if ( click ) {
                daysSelected.add("Tuesday")
                tuesdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                tuesdayB.setTextColor(whiteColor)
            } else {
                tuesdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                tuesdayB.setTextColor(primaryColor)
            }
        }
    }

    private fun wednesdayButtonColor(click: Boolean = true) {
        if ( daysSelected.contains("Wednesday") ) {
            if ( click ) {
                daysSelected.remove("Wednesday")
                wednesdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                wednesdayB.setTextColor(primaryColor)
            } else {
                wednesdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                wednesdayB.setTextColor(whiteColor)
            }
        } else {
            if ( click ) {
                daysSelected.add("Wednesday")
                wednesdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                wednesdayB.setTextColor(whiteColor)
            } else {
                wednesdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                wednesdayB.setTextColor(primaryColor)
            }
        }
    }

    private fun thursdayButtonColor(click: Boolean = true) {
        if ( daysSelected.contains("Thursday") ) {
            if ( click ) {
                daysSelected.remove("Thursday")
                thursdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                thursdayB.setTextColor(primaryColor)
            } else {
                thursdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                thursdayB.setTextColor(whiteColor)
            }
        } else {
            if ( click ) {
                daysSelected.add("Thursday")
                thursdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                thursdayB.setTextColor(whiteColor)
            } else {
                thursdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                thursdayB.setTextColor(primaryColor)
            }
        }
    }

    private fun fridayButtonColor(click: Boolean = true) {
        if ( daysSelected.contains("Friday") ) {
            if ( click ) {
                daysSelected.remove("Friday")
                fridayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                fridayB.setTextColor(primaryColor)
            } else {
                fridayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                fridayB.setTextColor(whiteColor)
            }
        } else {
            if ( click ) {
                daysSelected.add("Friday")
                fridayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                fridayB.setTextColor(whiteColor)
            } else {
                fridayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                fridayB.setTextColor(primaryColor)
            }
        }
    }

    private fun saturdayButtonColor(click: Boolean = true) {
        if ( daysSelected.contains("Saturday") ) {
            if ( click ) {
                daysSelected.remove("Saturday")
                saturdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                saturdayB.setTextColor(primaryColor)
            } else {
                saturdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                saturdayB.setTextColor(whiteColor)
            }
        } else {
            if ( click ) {
                daysSelected.add("Saturday")
                saturdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_color_primary)
                saturdayB.setTextColor(whiteColor)
            } else {
                saturdayB.background = ContextCompat.getDrawable(context, R.drawable.round_button_white)
                saturdayB.setTextColor(primaryColor)
            }
        }
    }

    fun getSelectedDaysList() : ArrayList<String> = daysSelected

    fun setSelectedDaysList( list: List<String> ) {
        list.forEach {
            daysSelected.add(it)
        }
        weekButtonsColors()
    }
}