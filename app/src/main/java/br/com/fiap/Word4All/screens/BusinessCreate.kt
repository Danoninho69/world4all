package br.com.fiap.Word4All.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.Word4All.R
import br.com.fiap.Word4All.components.AnimatedBorderCard
import br.com.fiap.Word4All.components.TextFieldCustom
import br.com.fiap.Word4All.ui.theme.Blue_1000
import br.com.fiap.Word4All.ui.theme.Blue_600
import br.com.fiap.Word4All.ui.theme.Blue_700
import br.com.fiap.Word4All.ui.theme.Blue_800
import br.com.fiap.Word4All.ui.theme.PurpleGrey200
import br.com.fiap.Word4All.ui.theme.Slate_Blue

@Composable
fun BusinessCreate (){
    var razaosocial by remember { mutableStateOf ("")}
    var cnpj by remember { mutableStateOf ("")}
    var nomeLocal by remember { mutableStateOf ("")}
    var nomeUf by remember { mutableStateOf ("")}
    var endereco by remember { mutableStateOf ("")}
    var cidade by remember { mutableStateOf ("")}
    var cep by remember { mutableStateOf ("")}


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(
                brush = Brush.sweepGradient(
                    listOf(
                        Blue_1000,
                        Blue_600,
                        Blue_800,
                        Blue_1000,
                    )
                )
            ),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            modifier = Modifier.padding(0.dp, 50.dp),
            text= "Registro Da Empresa",
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color.White,
                        Slate_Blue,
                        Color.White,
                    )
                )
            ),
        )

        Spacer(modifier = Modifier.padding(vertical = 0.dp, horizontal = 10.dp))


            Column(
                modifier = Modifier.padding(all = 24.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextFieldCustom(
                    value = razaosocial,
                    onValueChange = {
                        razaosocial = it
                    },
                    hint = stringResource(id = R.string.hint_razao_social),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .border(0.dp, Color.White, RoundedCornerShape(10.dp))
                        .fillMaxWidth()
                        .padding(0.dp, 0.dp)
                )

                Spacer(modifier = Modifier.padding(vertical = 5.dp, horizontal = 0.dp))

                TextFieldCustom(
                    value = cnpj,
                    onValueChange = {
                        cnpj = it
                    },
                    hint = stringResource(id = R.string.hint_cnpj),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .border(0.dp, Color.White, RoundedCornerShape(10.dp))
                        .fillMaxWidth()
                        .padding(0.dp, 0.dp)
                )

                Spacer(modifier = Modifier.padding(vertical = 15.dp, horizontal = 0.dp))

                TextFieldCustom(
                    value = cep,
                    onValueChange = {
                        cep = it
                    },
                    hint = stringResource(id = R.string.hint_cep),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .border(0.dp, Color.White, RoundedCornerShape(10.dp))
                        .fillMaxWidth()
                        .padding(0.dp, 0.dp)
                )

                Spacer(modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp))

                TextFieldCustom(
                    value = endereco,
                    onValueChange = {
                        endereco = it
                    },
                    hint = stringResource(id = R.string.hint_endereco),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .border(0.dp, Color.White, RoundedCornerShape(10.dp))
                        .fillMaxWidth()
                        .padding(0.dp, 0.dp)
                )

                Spacer(modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp))

                TextFieldCustom(
                    value = cidade,
                    onValueChange = {
                        cidade = it

                    },
                    hint = stringResource(id = R.string.hint_cidade),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .border(0.dp, Color.White, RoundedCornerShape(10.dp))
                        .fillMaxWidth()
                        .padding(0.dp, 0.dp)
                )

                Spacer(modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp))

                TextFieldCustom(
                    value = nomeUf,
                    onValueChange = {
                        nomeUf = it
                    },
                    hint = stringResource(id = R.string.hint_uf),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .border(0.dp, Color.White, RoundedCornerShape(10.dp))
                        .fillMaxWidth()
                        .padding(0.dp, 0.dp)
                )

                Spacer(modifier = Modifier.padding(vertical = 5.dp, horizontal = 0.dp))

                TextFieldCustom(
                    value = nomeLocal,
                    onValueChange = {
                        nomeLocal = it
                    },
                    hint = stringResource(id = R.string.hint_nomeLocal),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .border(0.dp, Color.White, RoundedCornerShape(10.dp))
                        .fillMaxWidth()
                        .padding(0.dp, 0.dp)
                )

                }

                Button(
                    onClick = {
                    },
                    modifier = Modifier
                        .width(400.dp)
                        .height(90.dp)
                        .padding(20.dp, 20.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .border(0.dp, Color.White, RoundedCornerShape(10.dp)),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Blue_800,
                        contentColor = Color.White

                    ),

                    shape = RoundedCornerShape(8.dp),
                ) {
                    Text(
                        text = stringResource(id = R.string.txt_Create),
                        fontSize = 26.sp
                    )
                }


    }

}

@Preview
@Composable
private fun BusinessCreatePreview() {
    BusinessCreate()
}