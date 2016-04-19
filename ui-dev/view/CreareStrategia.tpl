


<div class="col-lg-12 top" >
		<div class="col-lg-2">
				<input type="button" class="indietro button" value="Indietro"></input>
		</div>

		<div class="col-lg-4">
				<div class="title">
					Componi La tua Strategia
				</div>
		</div>

		<div class="col-lg-4">
				<div class="NomeStrategia">
					Nome Strategia : 
					<input type="text" class="inputNome"></input>
				</div>
		</div>

		<div class="col-lg-2">
				<input type="button" class="Salva button" value="Salva"></input>
		</div>

</div>

<div class="col-lg-12" ng-controller="CreareStrategiaCtrl">

	<div class="col-lg-6 strategiaZone" data-drop="true" qyoui-droppable style='height:50px; background-color:gray;'>


		
	</div>

	<div class="col-lg-6 condizioniZone" >
		<div ng-repeat="elem in condizioni">
		<condizione nome="{{elem.nome}}" class="btn btn-primary" data-drag="true" jqyoui-draggable="{animate:true}" data-jqyoui-options="{revert: 'invalid'}" >
			
			
		</condizione>
		</div>
	</div>
	
</div>
