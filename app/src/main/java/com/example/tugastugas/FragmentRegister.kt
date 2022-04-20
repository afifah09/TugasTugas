package com.example.tugastugas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.tugastugas.databinding.FragmentLoginBinding
import com.example.tugastugas.databinding.FragmentRegisterBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FragmentRegister : Fragment() {
    private lateinit var binding: FragmentRegisterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRegisterBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            btnRegister.setOnClickListener {
                val username = etRegisterUsername.text.toString()
                val email = etRegisterEmail.text.toString()
                val password = etRegisterPassword.text.toString()
                val registerRequest = RegisterReques(email, password , username )
                postRegis(registerRequest)
            }
        }
    }
    private fun postRegis(request: RegisterReques){
        ApiClient.instance.postregister(request).enqueue(object : Callback<RegisterRespons> {
            override fun onResponse(
                call: Call<RegisterRespons>,
                response: Response<RegisterRespons>
            ) {
                val code = response.code()
                if (code==201){
                    Toast.makeText(requireContext(), "register sukses", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<RegisterRespons>, t: Throwable) {

            }
        })
    }
}