package com.example.menu12.ui.po;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.menu12.R;
import com.example.menu12.databinding.FragmentPOBinding;
import com.example.menu12.ui.main.MainViewModel;

public class POFragment extends Fragment {

    private POViewModel mViewModel;

    public static POFragment newInstance() {
        return new POFragment();
    }


    private FragmentPOBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        POViewModel homeViewModel =
                new ViewModelProvider(this).get(POViewModel.class);

        binding = FragmentPOBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_p_o, container, false);
//    }
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        mViewModel = new ViewModelProvider(this).get(POViewModel.class);
//        // TODO: Use the ViewModel
//    }

}