package com.radiojobs.app

import android.os.Bundle
import com.radiojobs.app.base.BaseActivity
import com.radiojobs.app.databinding.ActivityMainBinding


class MainActivity : BaseActivity<ActivityMainBinding>() {

    companion object {
        private const val URL_LINK_WEBSITE = "https://radiojobs.com.br"
    }

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun setupViewModel() {
    }

    override fun setupUI(savedInstanceState: Bundle?) {
        binding.mainWebview.loadUrlExt(URL_LINK_WEBSITE)
        showAdBanner(binding.adsView.adsPhoneTabSpecialSmartBanner)
        showAdInterstitial(getString(R.string.admob_interstitial))
    }

}