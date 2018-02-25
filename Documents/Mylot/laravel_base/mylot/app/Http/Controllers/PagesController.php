<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class PagesController extends Controller
{
    //
    public function agentBrowse(Request $request)
    {
        return view('agentBrowse');
    }

    public function login()
    {
        return view('auth/login');
    }
}
