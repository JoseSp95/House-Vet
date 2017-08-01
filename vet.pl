/*
    se ingresan 6 sintomas por java obligatorio 
*/

%MEMORIA ACTIVA
:-dynamic var/2.

% ENFERMEDADES
enfermedad(rabia).
enfermedad(otitis).
enfermedad(parvovirus).
enfermedad(resfriado).
enfermedad(ascaris). %parasitos intestinales
enfermedad(diabetes).

% RABIA

sintoma(rabia, violencia_extrema). % --
sintoma(rabia, fiebre).				% --
sintoma(rabia, convulsiones). % --
sintoma(rabia, perdida_de_apetito). % ---
sintoma(rabia, salivacion_espumosa). % --
sintoma(rabia, diarrea). % --

% OTITIS

sintoma(otitis, cabeza_inclinada). % --
sintoma(otitis, se_rasca_las_orejas_muy_seguido). % --
sintoma(otitis, dolor_en_las_orejas). % --
sintoma(otitis, mal_olor_en_los_oidos). % --
sintoma(otitis, agresividad_leve). % --
sintoma(otitis, secrecion_en_los_oidos). % --

% PARVOVIRUS
sintoma(parvovirus, vomito). % --
sintoma(parvovirus, diarrea). % --
sintoma(parvovirus, heces_con_sangre). % --
sintoma(parvovirus, perdida_de_apetito). % --
sintoma(parvovirus, deshidratacion).% --
sintoma(parvovirus, cansancio). % --

% RESFRIADO
sintoma(resfriado, secrecion_nasal). % --
sintoma(resfriado, dificultad_para_respirar).% --
sintoma(resfriado, tos). % --
sintoma(resfriado, ojos_llorosos). % --
sintoma(resfriado, perdida_de_apetito). % --
sintoma(resfriado, estornudo).% --

% ascaris o Parasitos Intestinales
sintoma(ascaris, dolor_abdominal). % --
sintoma(ascaris, barriga_hinchada). % --
sintoma(ascaris, vomito). % --
sintoma(ascaris, diarrea). % --
sintoma(ascaris, tos). % --

% Diabetes
sintoma(diabetes, sed_extrema). % --
sintoma(diabetes, adelgazamiento). % --
sintoma(diabetes, aumento_del_apetito). % --
sintoma(diabetes, orina_con_frecuencia). %--
sintoma(diabetes, bebe_demasiada_agua). % ---
sintoma(diabetes, cansancio). % --

%Leucemia
sintoma(leucemia, fiebre). % --
sintoma(leucemia, perdida_de_apetito). % --
sintoma(leucemia, diarrea). % --
sintoma(leucemia, palidez_en_la_ancia). % --
sintoma(leucemia, dificultad_para_respirar). % --
sintoma(leucemia, falta_de_coordinacion).% --
sintoma(leucemia, sangrado_de_repente).% --	

%----------------------------------------------------------------
%CONSULTA A MEMORIA ACTIVA
%----------------------------------------------------------------
evaluarHecho(rabia,Hecho,Respuesta):- var(Hecho,Respuesta), !.
evaluarHecho(rabia,_,no).

evaluarHecho(otitis,Hecho,Respuesta):- var(Hecho,Respuesta), !.
evaluarHecho(otitis,_,no).

evaluarHecho(parvovirus,Hecho,Respuesta):- var(Hecho,Respuesta), !.
evaluarHecho(parvovirus,_,no).

evaluarHecho(resfriado,Hecho,Respuesta):- var(Hecho,Respuesta), !.
evaluarHecho(resfriado,_,no).

evaluarHecho(ascaris,Hecho,Respuesta):- var(Hecho,Respuesta), !.
evaluarHecho(ascaris,_,no).

evaluarHecho(diabetes,Hecho,Respuesta):- var(Hecho,Respuesta), !.
evaluarHecho(diabetes,_,no).

evaluarHecho(leucemia,Hecho,Respuesta):- var(Hecho,Respuesta), !.
evaluarHecho(leucemia,_,no).

%----------------------------------------------------------------
%FUNCIONES GENERALES
%----------------------------------------------------------------
detValor(si,1).
detValor(no,0).

getListaSintomas(Enfermedad, ListaSintomas):- findall(Sintoma,sintoma(Enfermedad,Sintoma),ListaSintomas).
			
detNroPreguntas(_,[],0).

detNroPreguntas(Enfermedad,[Hecho|L],N):-
	evaluarHecho(Enfermedad,Hecho,Respuesta),
	detValor(Respuesta,Valor),
	detNroPreguntas(Enfermedad,L,Nnuevo),
	N is Valor+Nnuevo.

detNroPreguntasSint(Enfermedad,N):-
	getListaSintomas(Enfermedad,ListaSintomas),
	detNroPreguntas(Enfermedad,ListaSintomas,N).

%----------------------------------------------------------------
%REGLAS DE INFERENCIA
%----------------------------------------------------------------
apply :- assert(var(violencia_extrema,si)),
		 assert(var(fiebre,si)),
		 assert(var(convulsiones,si)),
		 assert(var(perdida_de_apetito,si)),
         assert(var(salivacion_espumosa,si)).

%retractall(s1(_,_)),
%retractall(s2(_,_)),

diagnosticar(rabia):- detNroPreguntasSint(rabia,N), N>=5, !.

diagnosticar(otitis):- detNroPreguntasSint(otitis,N), N>=5, !.

diagnosticar(parvovirus):- detNroPreguntasSint(parvovirus,N), N>=5, !.

diagnosticar(resfriado):- detNroPreguntasSint(resfriado,N), N>=5, !.

diagnosticar(ascaris):- detNroPreguntasSint(ascaris,N), N>=5, !.

diagnosticar(diabetes):- detNroPreguntasSint(diabetes,N), N>=5, !.

diagnosticar(leucemia):- detNroPreguntasSint(leucemia,N), N>=5, !.

diagnosticar(no_determinado).

	










