package com.example.zeldaapp.tasks

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.zeldaapp.R
import com.example.zeldaapp.customtask.CustomTaskActivity
import com.example.zeldaapp.errorsandvalidation.ErrorsAndValidationActivity

class TasksFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_tasks, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupZelAppCVClick()
        setupErrorsAndValidationCVClick()
        setupCustomTaskCVClick()
    }

    private fun setupZelAppCVClick() {
        view?.findViewById<CardView>(R.id.cv_zelda_app)?.setOnClickListener {
            findNavController().navigate(
                TasksFragmentDirections.goToCategoryTypeList()
            )
        }
    }

    private fun setupErrorsAndValidationCVClick() {
        view?.findViewById<CardView>(R.id.cv_errors_and_validation)?.setOnClickListener {
            startActivity(Intent(context, ErrorsAndValidationActivity::class.java))
        }
    }

    private fun setupCustomTaskCVClick() {
        view?.findViewById<CardView>(R.id.cv_custom_task)?.setOnClickListener {
            startActivity(Intent(context, CustomTaskActivity::class.java))
        }
    }

}