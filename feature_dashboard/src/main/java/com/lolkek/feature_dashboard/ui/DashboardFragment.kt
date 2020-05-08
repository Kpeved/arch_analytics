package com.lolkek.feature_dashboard.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lolkek.feature_dashboard.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class DashboardFragment : Fragment() {

    private val dashboardViewModel: DashboardViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dashboardViewModel.init()
        if (savedInstanceState == null) dashboardViewModel.onFirstTimeCreated()
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        dashboardViewModel.onSaveState()
        super.onSaveInstanceState(outState)

    }

    override fun onDestroy() {
        dashboardViewModel.onDestroy()
        super.onDestroy()

    }
}
