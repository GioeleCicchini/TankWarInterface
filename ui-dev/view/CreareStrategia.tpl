


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

	<div class="col-lg-6 strategiaZone" data-drop="true" ng-model="dropzone" jqyoui-droppable style='height:150px; background-color:gray;'>

				<div ng-repeat="elem in dropzone track by $index"  ng-model="dropzone" data-jqyoui-options="{revert: 'invalid', helper: 'clone'}">
					<condizionedroppata nome="{{elem.nome}}" class="btn btn-primary" ></condizionedroppata>
				</div>

		
	</div>

	<div class="col-lg-6 condizioniZone">

		<div ng-repeat="elem in condizioni"  ng-model="condizioni" >
			<condizione nome="{{elem.nome}}" class="btn btn-primary" data-drag="true" data-jqyoui-options="{revert: 'invalid',helper: 'clone'}" ng-model="condizioni" jqyoui-draggable="{index: {{$index}},animate:true,placeholder: 'keep'}" ></condizione>
		</div>
	</div>
	
</div>
