package com.example.finaltask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

public class TelaInicial extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        tabLayout = findViewById(R.id.tabLayout_Options);
        viewPager = findViewById(R.id.viewpager);
        tabLayout.setupWithViewPager(viewPager);
        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new fragment1(),"Início");
        vpAdapter.addFragment(new Fragment2(),"Cardápios");
        vpAdapter.addFragment(new Fragment3(),"Diário");
        vpAdapter.addFragment(new Fragment4(),"Configurações");
        viewPager.setAdapter(vpAdapter);
    }
    public void NextPage(View view)
    {
        Intent i = new Intent(this, TelaInicial.class);
        startActivity(i);
    }

}