package me.aluceps.verticaltablayout

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_page.*

class PageFragment : Fragment() {

    private val dataTitle: String by lazy {
        arguments?.getString(DATA_TITLE) ?: ""
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        title.text = dataTitle
    }

    companion object {

        private const val DATA_TITLE = "title"

        fun newInstance(title: String): PageFragment = PageFragment().apply {
            arguments = Bundle().apply {
                putString(DATA_TITLE, title)
            }
        }
    }
}